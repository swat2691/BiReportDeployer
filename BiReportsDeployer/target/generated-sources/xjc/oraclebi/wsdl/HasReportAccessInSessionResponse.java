//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.24 at 06:25:09 PM MSK 
//


package oraclebi.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hasReportAccessInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hasReportAccessInSessionReturn"
})
@XmlRootElement(name = "hasReportAccessInSessionResponse")
public class HasReportAccessInSessionResponse {

    protected boolean hasReportAccessInSessionReturn;

    /**
     * Gets the value of the hasReportAccessInSessionReturn property.
     * 
     */
    public boolean isHasReportAccessInSessionReturn() {
        return hasReportAccessInSessionReturn;
    }

    /**
     * Sets the value of the hasReportAccessInSessionReturn property.
     * 
     */
    public void setHasReportAccessInSessionReturn(boolean value) {
        this.hasReportAccessInSessionReturn = value;
    }

}