//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.24 at 06:25:09 PM MSK 
//


package oraclebi.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="deliveryRequest" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}DeliveryRequest"/>
 *         &lt;element name="bipSessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "deliveryRequest",
    "bipSessionToken"
})
@XmlRootElement(name = "deliveryServiceInSession")
public class DeliveryServiceInSession {

    @XmlElement(required = true)
    protected DeliveryRequest deliveryRequest;
    @XmlElement(required = true)
    protected String bipSessionToken;

    /**
     * Gets the value of the deliveryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryRequest }
     *     
     */
    public DeliveryRequest getDeliveryRequest() {
        return deliveryRequest;
    }

    /**
     * Sets the value of the deliveryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryRequest }
     *     
     */
    public void setDeliveryRequest(DeliveryRequest value) {
        this.deliveryRequest = value;
    }

    /**
     * Gets the value of the bipSessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBipSessionToken() {
        return bipSessionToken;
    }

    /**
     * Sets the value of the bipSessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBipSessionToken(String value) {
        this.bipSessionToken = value;
    }

}
