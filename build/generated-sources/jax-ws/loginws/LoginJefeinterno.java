
package loginws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para loginJefeinterno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="loginJefeinterno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="u2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="p2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginJefeinterno", propOrder = {
    "u2",
    "p2"
})
public class LoginJefeinterno {

    protected String u2;
    protected String p2;

    /**
     * Obtiene el valor de la propiedad u2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getU2() {
        return u2;
    }

    /**
     * Define el valor de la propiedad u2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setU2(String value) {
        this.u2 = value;
    }

    /**
     * Obtiene el valor de la propiedad p2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP2() {
        return p2;
    }

    /**
     * Define el valor de la propiedad p2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP2(String value) {
        this.p2 = value;
    }

}
