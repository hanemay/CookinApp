
package com.kraftfoods.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNutritionGridItemDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNutritionGridItemDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NutritionGridItemDetail" type="{http://www.kraftfoods.com/ws/}NutritionGridItemDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNutritionGridItemDetail", propOrder = {
    "nutritionGridItemDetail"
})
public class ArrayOfNutritionGridItemDetail {

    /**
     *
     */
    @XmlElement(name = "NutritionGridItemDetail", nillable = true)
    protected List<NutritionGridItemDetail> nutritionGridItemDetail;

    /**
     * Gets the value of the nutritionGridItemDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nutritionGridItemDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNutritionGridItemDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NutritionGridItemDetail }
     * 
     * 
     * @return 
     */
    public List<NutritionGridItemDetail> getNutritionGridItemDetail() {
        if (nutritionGridItemDetail == null) {
            nutritionGridItemDetail = new ArrayList<NutritionGridItemDetail>();
        }
        return this.nutritionGridItemDetail;
    }

}
