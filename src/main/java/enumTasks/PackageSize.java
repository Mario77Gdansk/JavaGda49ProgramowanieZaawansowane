package enumTasks;

public enum PackageSize {
    SMALL(10, 25),
    MEDIUM(25, 50),
    LARGE(50, 100),
    UNKNOWN(0, 0);

    int minSize;
    int maxSize;

    PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    protected static PackageSize getPackageSize(int minSize, int maxSize) {
        for (PackageSize packageSize : values())
        {
            if (minSize >= packageSize.minSize && maxSize < packageSize.maxSize)
            {
                return packageSize;
            }
        }
        return UNKNOWN;
    }
}
