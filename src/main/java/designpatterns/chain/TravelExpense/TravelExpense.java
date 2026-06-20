package designpatterns.chain.TravelExpense;

import java.math.BigDecimal;

public abstract class TravelExpense implements Comparable<TravelExpense> {
    private String id;
    private String city;
    private BigDecimal transportation;
    private BigDecimal hotelrates;
    private int days;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public BigDecimal getTransportation() { return transportation; }
    public void setTransportation(BigDecimal transportation) { this.transportation = transportation; }
    public BigDecimal getHotelrates() { return hotelrates; }
    public void setHotelrates(BigDecimal hotelrates) { this.hotelrates = hotelrates; }
    public int getDays() { return days; }
    public void setDays(int days) { this.days = days; }

    @Override
    public int compareTo(TravelExpense o) {
        return this.id.compareTo(o.id);
    }

    public abstract BigDecimal getHotelRatesStandards();
    public abstract BigDecimal getReturnPercent();
    public abstract BigDecimal getAllowancePercent();

    public BigDecimal compute() {
        BigDecimal transportationCost = transportation;
        BigDecimal dailyAllowance = getDailyAllowance().multiply(BigDecimal.valueOf(days));
        BigDecimal hotelCost = hotelrates.multiply(BigDecimal.valueOf(days));
        BigDecimal hotelDifference = calculateHotelDifference();

        BigDecimal total = transportationCost.add(dailyAllowance).add(hotelCost).add(hotelDifference);
        return total.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    private BigDecimal getDailyAllowance() {
        switch (city) {
            case "一线城市": return new BigDecimal("90");
            case "二线城市": return new BigDecimal("70");
            case "三线城市":
            case "四线城市": return new BigDecimal("60");
            default: throw new IllegalArgumentException("无效的出差地类别: " + city);
        }
    }

    private BigDecimal calculateHotelDifference() {
        BigDecimal standard = getHotelRatesStandards();
        BigDecimal actual = hotelrates;
        BigDecimal diffPerDay = actual.subtract(standard);
        BigDecimal totalDiff;

        if (diffPerDay.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal selfPay = diffPerDay.multiply(getReturnPercent()).multiply(BigDecimal.valueOf(days));
            totalDiff = selfPay.negate();
        } else if (diffPerDay.compareTo(BigDecimal.ZERO) < 0) {
            BigDecimal shortage = standard.subtract(actual);
            BigDecimal subsidy = shortage.multiply(getAllowancePercent()).multiply(BigDecimal.valueOf(days));
            totalDiff = subsidy;
        } else {
            totalDiff = BigDecimal.ZERO;
        }
        return totalDiff;
    }

    public static TravelExpense getInstance(String post) {
        switch (post) {
            case "普通员工": return new StaffTravelExpense();
            case "主管": return new LeaderTravelExpense();
            case "高层": return new PMTravelExpense();
            default: throw new IllegalArgumentException("无效的行政级别: " + post);
        }
    }
}