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
 *         &lt;element name="getFolderContentsInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/PublicReportService}CatalogContents"/>
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
    "getFolderContentsInSessionReturn"
})
@XmlRootElement(name = "getFolderContentsInSessionResponse")
public class GetFolderContentsInSessionResponse {

    @XmlElement(required = true)
    protected CatalogContents getFolderContentsInSessionReturn;

    /**
     * Gets the value of the getFolderContentsInSessionReturn property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogContents }
     *     
     */
    public CatalogContents getGetFolderContentsInSessionReturn() {
        return getFolderContentsInSessionReturn;
    }

    /**
     * Sets the value of the getFolderContentsInSessionReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogContents }
     *     
     */
    public void setGetFolderContentsInSessionReturn(CatalogContents value) {
        this.getFolderContentsInSessionReturn = value;
    }

}
