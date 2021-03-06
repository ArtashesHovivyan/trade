package am.trade.tradeappweb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransferDto {

    private int sectionId;
    private Double outComing;
    public String description;
}

//{
//        "sectionId": "59",
//        "outComing": "4000",
//        "description": "perevovd"
//        }