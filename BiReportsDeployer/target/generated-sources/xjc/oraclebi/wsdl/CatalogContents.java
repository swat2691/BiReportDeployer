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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogContents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogContents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogContents" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}ArrayOfItemData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogContents", propOrder = {
    "catalogContents"
})
public class CatalogContents {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfItemData catalogContents;

    /**
     * Gets the value of the catalogContents property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemData }
     *     
     */
    public ArrayOfItemData getCatalogContents() {
        return catalogContents;
    }

    /**
     * Sets the value of the catalogContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemData }
     *     
     */
    public void setCatalogContents(ArrayOfItemData value) {
        this.catalogContents = value;
    }

}
