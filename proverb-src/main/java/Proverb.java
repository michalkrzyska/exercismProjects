class Proverb {

    private String[] words;

    public Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder sb = new StringBuilder();
        switch (words.length) {
            case 0:
                return "";
            case 1:
                return "And all for the want of a " + words[0] + ".";
            default:
                for (int i = 0; i < words.length-1; i++){
                    sb.append("For want of a ").append(words[i]).append(" the ").append(words[i + 1]).append(" was lost.\n");
                }
                sb.append("And all for the want of a ").append(words[0]).append(".");
        }
        return sb.toString();
    }
}
