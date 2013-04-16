// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package net.webservicex;

public enum BarcodeOption {

    NONE("None"),
  

    CODE("Code"),
  

    TYP("Typ"),
  

    BOTH("Both");
  
  
    private final String value;
  
    BarcodeOption(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static BarcodeOption fromValue(String v) {
        if (v != null) {
            for (BarcodeOption c: BarcodeOption.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}