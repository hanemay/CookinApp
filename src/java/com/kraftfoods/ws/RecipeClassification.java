
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipeClassification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipeClassification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClassificationID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ClassificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipeClassification", propOrder = {
    "classificationID",
    "classificationName"
})
public class RecipeClassification {

    /**
     *
     */
    @XmlElement(name = "ClassificationID")
    protected int classificationID;

    /**
     *
     */
    @XmlElement(name = "ClassificationName")
    protected String classificationName;

    /**
     * Gets the value of the classificationID property.
     * 
     * @return 
     */
    public int getClassificationID() {
        return classificationID;
    }

    /**
     * Sets the value of the classificationID property.
     * 
     * @param value
     */
    public void setClassificationID(int value) {
        this.classificationID = value;
    }

    /**
     * Gets the value of the classificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificationName() {
        return classificationName;
    }

    /**
     * Sets the value of the classificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationName(String value) {
        this.classificationName = value;
    }

}
