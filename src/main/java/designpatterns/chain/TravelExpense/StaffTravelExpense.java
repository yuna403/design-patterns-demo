package designpatterns.chain.TravelExpense;

import java.math.BigDecimal;

public class StaffTravelExpense extends TravelExpense {
    @Override
    public BigDecimal getHotelRatesStandards() {
        switch (getCity()) {
            case "一线城市": return new BigDecimal("270");
            case "二线城市": return new BigDecimal("230");
            case "三线城市": return new BigDecimal("200");
            case "四线城市": return new BigDecimal("150");
            default: throw new IllegalArgumentException("无效的出差地类别: " + getCity());
        }
    }

    @Override
    public BigDecimal getReturnPercent() { return new BigDecimal("0.5"); }

    @Override
    public BigDecimal getAllowancePercent() { return new BigDecimal("0.7"); }
}