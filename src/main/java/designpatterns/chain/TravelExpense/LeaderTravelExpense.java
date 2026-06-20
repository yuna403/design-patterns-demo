package designpatterns.chain.TravelExpense;

import java.math.BigDecimal;

public class LeaderTravelExpense extends TravelExpense {
    @Override
    public BigDecimal getHotelRatesStandards() {
        switch (getCity()) {
            case "一线城市": return new BigDecimal("350");
            case "二线城市": return new BigDecimal("300");
            case "三线城市": return new BigDecimal("250");
            case "四线城市": return new BigDecimal("150");
            default: throw new IllegalArgumentException("无效的出差地类别: " + getCity());
        }
    }

    @Override
    public BigDecimal getReturnPercent() { return new BigDecimal("0.4"); }

    @Override
    public BigDecimal getAllowancePercent() { return new BigDecimal("0.5"); }
}