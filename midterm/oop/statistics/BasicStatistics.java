package midterm.oop.statistics;

public class BasicStatistics implements Statistics {
    private DataSet dataSet;

    /**
     * Hàm dựng khởi tạo tập dữ liệu.
     */
    public BasicStatistics() {
        /* TODO */
    }

    public void setDataSet(DataSet dataSet) {
        /* TODO */
        this.dataSet = dataSet;
    }

    @Override
    public int size() {
        /* TODO */
        return dataSet.size();
    }

    @Override
    public double max() {
        /* TODO */
        return 0;
    }

    @Override
    public double min() {
        /* TODO */
        return 0;
    }

    @Override
    public double mean() {
        /* TODO */
        return 0;
    }

    @Override
    public double variance() {
        /* TODO */
        return 0;
    }

    @Override
    public AbstractDataSet rank() {
        /* TODO */
        return null;
    }

    @Override
    public double median() {
        /* TODO */
        return 0;
    }
}
