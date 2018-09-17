
package crudproject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="old_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="new_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="new_username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="new_password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateData", propOrder = {
    "oldId",
    "newId",
    "newUsername",
    "newPassword"
})
public class UpdateData {

    @XmlElement(name = "old_id")
    protected int oldId;
    @XmlElement(name = "new_id")
    protected int newId;
    @XmlElement(name = "new_username")
    protected String newUsername;
    @XmlElement(name = "new_password")
    protected String newPassword;

    /**
     * Gets the value of the oldId property.
     * 
     */
    public int getOldId() {
        return oldId;
    }

    /**
     * Sets the value of the oldId property.
     * 
     */
    public void setOldId(int value) {
        this.oldId = value;
    }

    /**
     * Gets the value of the newId property.
     * 
     */
    public int getNewId() {
        return newId;
    }

    /**
     * Sets the value of the newId property.
     * 
     */
    public void setNewId(int value) {
        this.newId = value;
    }

    /**
     * Gets the value of the newUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewUsername() {
        return newUsername;
    }

    /**
     * Sets the value of the newUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewUsername(String value) {
        this.newUsername = value;
    }

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
    }

}
