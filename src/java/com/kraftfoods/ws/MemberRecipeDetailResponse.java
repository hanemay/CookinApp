
package com.kraftfoods.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberRecipeDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberRecipeDetailResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MemberRecipeDetail" type="{http://www.kraftfoods.com/ws/}MemberRecipeDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberRecipeDetailResponse", propOrder = {
    "status",
    "memberRecipeDetail"
})
public class MemberRecipeDetailResponse {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "MemberRecipeDetail")
    protected MemberRecipeDetail memberRecipeDetail;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the memberRecipeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link MemberRecipeDetail }
     *     
     */
    public MemberRecipeDetail getMemberRecipeDetail() {
        return memberRecipeDetail;
    }

    /**
     * Sets the value of the memberRecipeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberRecipeDetail }
     *     
     */
    public void setMemberRecipeDetail(MemberRecipeDetail value) {
        this.memberRecipeDetail = value;
    }

}
