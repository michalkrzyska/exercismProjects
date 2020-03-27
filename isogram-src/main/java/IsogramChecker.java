class IsogramChecker {

    boolean isIsogram(String phrase) {
        if (phrase.isEmpty()) {
            return true;
        } else {
            String newString = phrase.replaceAll(" ", "").replaceAll("-", "").toLowerCase();
            for (int i = 0; i < newString.length(); i++) {
                for (int j = i + 1; j < newString.length(); j++) {
                    if (newString.charAt(i) == newString.charAt(j)) {
                        return false;
                    }
                }
            }

        }

        return true;
    }
}

