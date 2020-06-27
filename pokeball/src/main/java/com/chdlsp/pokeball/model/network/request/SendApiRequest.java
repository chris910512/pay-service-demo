package com.chdlsp.pokeball.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SendApiRequest {

    private BigDecimal SendTotAmt;
    private Integer SendTotCnt;

}
