
package com.kraftfoods.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVideoRecipeSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVideoRecipeSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VideoRecipeSummary" type="{http://www.kraftfoods.com/ws/}VideoRecipeSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVideoRecipeSummary", propOrder = {
    "videoRecipeSummary"
})
public class ArrayOfVideoRecipeSummary {

    @XmlElement(name = "VideoRecipeSummary", nillable = true)
    protected List<VideoRecipeSummary> videoRecipeSummary;

    /**
     * Gets the value of the videoRecipeSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoRecipeSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoRecipeSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoRecipeSummary }
     * 
     * 
     */
    public List<VideoRecipeSummary> getVideoRecipeSummary() {
        if (videoRecipeSummary == null) {
            videoRecipeSummary = new ArrayList<VideoRecipeSummary>();
        }
        return this.videoRecipeSummary;
    }

}
