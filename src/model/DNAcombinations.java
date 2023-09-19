package model;

public enum DNAcombinations {
    DN("DN", "A"),
    DA("DA", "N"),
    ND("ND", "A"),
    NA("NA", "D"),
    AD("AD", "N"),
    AN("AN", "D");

    private String strValue;
    private String mergeResult;

    DNAcombinations(String strValue, String mergeResult) {
        this.strValue = strValue;
        this.mergeResult = mergeResult;
    }

    public String getStrValue() {
        return strValue;
    }

    public String getMergeResult() {
        return mergeResult;
    }

    public static DNAcombinations fromString(String input) {
        for (DNAcombinations combination : DNAcombinations.values()) {
            if (combination.strValue.equals(input)) {
                return combination;
            }
        }
        throw new IllegalArgumentException("Invalid DNA combination: " + input);
    }
}
