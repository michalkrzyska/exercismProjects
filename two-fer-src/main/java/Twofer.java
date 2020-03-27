class Twofer {
    String twofer(String name) {
        String s;
        if (name == null){
            s = "One for you, one for me.";
        } else {
            s = "One for " + name + ", one for me.";
        }
        return s;
    }


}
