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
    }

    public String getStrValue() {
        return strValue;
    }

    public String getMergeResult() {
        return mergeResult;
    }
}
