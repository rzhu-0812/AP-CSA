public class BoxOfCandy {
    private Candy[][] box;

    public BoxOfCandy(Candy[][] box) {
        this.box = box;
    }

    public boolean moveCandyToFirstRow(int col) {
        if (box[0][col] != null) return true;

        for (int row = 1; row < box.length; row++) {
            if (box[row][col] != null) {
                box[0][col] = box[row][col];
                box[row][col] = null;
                return true;
            }
        }

        return false;
    }

    public Candy removeNextByFlavor(String flavor) {
        for (int row = box.length - 1; row >= 0; row--) {
            for (int col = 0; col < box[0].length; col++) {
                Candy currCandy = box[row][col];

                if (currCandy != null && currCandy.getFlavor().equals(flavor)) {
                    box[row][col] = null;
                    return currCandy;
                }
            }
        }

        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < box.length; row++) {
            sb.append("[");
            for (int col = 0; col < box[row].length; col++) {
                Candy currBox = box[row][col];
                sb.append(currBox == null ? "null" : currBox.getFlavor());
                
                if (col < box[row].length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            
            if (row < box.length - 1) {
                sb.append(",\n");
            }
        }
        return sb.toString();
    }
}
