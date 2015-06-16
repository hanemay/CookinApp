
package com.kraftfoods.ws;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iRecipeBoxRecipeID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iRecipeBoxRecipeID"
})
@XmlRootElement(name = "DeleteRecipeFromRecipeBox")
public class DeleteRecipeFromRecipeBox {

    /**
     *
     */
    protected int iRecipeBoxRecipeID;

    /**
     * Gets the value of the iRecipeBoxRecipeID property.
     * 
     * @return 
     */
    public int getIRecipeBoxRecipeID() {
        return iRecipeBoxRecipeID;
    }

    /**
     * Sets the value of the iRecipeBoxRecipeID property.
     * 
     * @param value
     */
    public void setIRecipeBoxRecipeID(int value) {
        this.iRecipeBoxRecipeID = value;
    }

}
