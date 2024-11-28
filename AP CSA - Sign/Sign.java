public class Sign {
    private String message;
    private int width;

    public Sign (String message, int width) {
        this.message = message;
        this.width = width;
    }

    public int numberOfLines() {
        return message.length() / width + 1;
    }

    public String getLines() {
        if (message.equals("")) return "null";
        if (message.length() <= width) return message;

        String splitMessage = "";

        for (int i = 0; i < message.length(); i++) {
            splitMessage += message.substring(i, i + 1);
            if ((i + 1) % width == 0 && i != message.length() - 1) splitMessage += ";";
        }
        return splitMessage;
    }
}
