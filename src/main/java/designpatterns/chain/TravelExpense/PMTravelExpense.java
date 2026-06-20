package designpatterns.chain.TravelExpense;

import java.math.BigDecimal;

public class PMTravelExpense extends TravelExpense {
    @Override
    public BigDecimal getHotelRatesStandards() {
        switch (getCity()) {
            case "一线城市": return new BigDecimal("700");
            case "二线城市": return new BigDecimal("600");
            case "三线城市": return new BigDecimal("500");
            case "四线城市": return new BigDecimal("400");
            default: throw new IllegalArgumentException("无效的出差地类别: " + getCity());
        }
    }

    @Override
    public BigDecimal getReturnPercent() { return new BigDecimal("0.2"); }

    @Override
    public BigDecimal getAllowancePercent() { return new BigDecimal("0.3"); }
}