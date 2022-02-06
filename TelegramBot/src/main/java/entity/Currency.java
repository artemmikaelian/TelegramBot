package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Currency {
    EUR(451), RUB(456), USD(431), BYN(0);
    private final int id;
}
