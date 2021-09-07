package com.gvdw.datatables_server_side.models.state;

import lombok.EqualsAndHashCode;

import java.util.Objects;

/**
 * @author Gullian Van Der Walt
 * Created at 11:43 on Sep, 2021
 *
 * Class for jQuery DataTable, used for sorting
 */
public class Order {
    private Integer column;
    private Direction direction;

    public Order() {
    }

    public Order(Integer column, Direction direction) {
        this.column = column;
        this.direction = direction;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(column, order.column) && Objects.equals(direction, order.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(column, direction);
    }
}
