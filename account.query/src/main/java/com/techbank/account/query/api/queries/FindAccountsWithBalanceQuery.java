package com.techbank.account.query.api.queries;

import com.techbank.account.query.api.dto.EqualityTypeEnum;
import com.techbank.cqrs.core.queries.BaseQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class FindAccountsWithBalanceQuery extends BaseQuery {
    private EqualityTypeEnum equalityType;
    private Double balance;
}
