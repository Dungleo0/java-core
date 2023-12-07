package vector_test;

import java.util.Arrays;

public abstract class AbstractMyVector implements MyVector {
    /**
     * Mô tả vector theo định dạng [a1 a2 ... an]
     * @return
     */



    @Override
    public String toString() {
        /* TODO */

        return Arrays.toString(coordinates()).replaceAll(", "," ");
    }

    /**
     * So sánh hai vector có bằng nhau không.
     * Hai vector bằng nhau nếu có cùng số chiều và có tọa độ bằng nhau.
     * @param another
     * @return
     */
    @Override
    public boolean equals(MyVector another) {
        /* TODO */
        if (another == null || another.size() != size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            if (coordinate(i) != another.coordinate(i)) {
                return false;
            }
        }
        return true;

    }


}
