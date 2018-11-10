
package com.osc.cbrq.producao.pricebook;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ReturnMode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Key"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReturnMode", namespace = "http://xmlns.oracle.com/adf/svc/types/")
@XmlEnum
public enum ReturnMode {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Key")
    KEY("Key"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    ReturnMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnMode fromValue(String v) {
        for (ReturnMode c: ReturnMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
