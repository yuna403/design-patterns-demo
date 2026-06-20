package designpatterns.chain.TravelExpense;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TravelExpense> expenses = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("source.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                String[] parts = line.split("\\s+");
                if (parts.length != 6) continue;

                String id = parts[0];
                String post = parts[1];
                String cityType = parts[2];
                String transportStr = parts[3];
                String hotelStr = parts[4];
                String daysStr = parts[5];

                if (!isValidPost(post) || !isValidCity(cityType)) continue;

                try {
                    BigDecimal transport = new BigDecimal(transportStr);
                    BigDecimal hotel = new BigDecimal(hotelStr);
                    int days = Integer.parseInt(daysStr);
                    if (transport.compareTo(BigDecimal.ZERO) < 0 ||
                            hotel.compareTo(BigDecimal.ZERO) < 0 || days <= 0) continue;

                    TravelExpense expense = TravelExpense.getInstance(post);
                    expense.setId(id);
                    expense.setCity(cityType);
                    expense.setTransportation(transport);
                    expense.setHotelrates(hotel);
                    expense.setDays(days);
                    expenses.add(expense);
                } catch (NumberFormatException e) {  // 分开捕获子类异常
                    continue;
                } catch (IllegalArgumentException e) {  // 单独捕获父类异常
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(expenses);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))) {
            for (TravelExpense e : expenses) {
                writer.write(String.format("%s %.2f%n", e.getId(), e.compute()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isValidPost(String post) {
        return post.equals("普通员工") || post.equals("主管") || post.equals("高层");
    }

    private static boolean isValidCity(String city) {
        return city.equals("一线城市") || city.equals("二线城市") ||
                city.equals("三线城市") || city.equals("四线城市");
    }
}