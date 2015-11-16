package org.wlf.filedownloader.http_downlaoder;

/**
 * data range
 * <br/>
 * 表示数据范围
 *
 * @author wlf(Andy)
 * @email 411086563@qq.com
 */
public class Range {

    public final int startPos;// public final field
    public final int endPos;// public final field

    public Range(int startPos, int endPos) {
        super();
        this.startPos = startPos;
        this.endPos = endPos;
    }

    public int getLength() {
        return endPos - startPos;
    }

    /**
     * check data range whether legal
     *
     * @param range data range
     * @return true means legal
     */
    public static boolean isLegal(Range range) {
        if (range != null && range.startPos > 0 && range.endPos > 0 && range.endPos > range.startPos) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Range) {
            Range other = (Range) o;
            if (other.startPos == startPos && other.endPos == endPos) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "[" + startPos + "," + endPos + "]";
    }
}
