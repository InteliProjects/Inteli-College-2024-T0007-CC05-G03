//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.02.22 at 08:27:36 PM UTC
//


package inteli.xml.sudeste;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{}codigoProduto"/&gt;
 *         &lt;element ref="{}codigoSubmodal"/&gt;
 *         &lt;element ref="{}data"/&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}idCliente"/&gt;
 *         &lt;element ref="{}idEloDestino"/&gt;
 *         &lt;element ref="{}idEloOrigem"/&gt;
 *         &lt;element ref="{}quantidadeLote" minOccurs="0"/&gt;
 *         &lt;element ref="{}quantidadeMassa"/&gt;
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
    "codigoProduto",
    "codigoSubmodal",
    "data",
    "id",
    "idCliente",
    "idEloDestino",
    "idEloOrigem",
    "quantidadeLote",
    "quantidadeMassa"
})
@XmlRootElement(name = "previsaoCarregamento")
public class PrevisaoCarregamento {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoProduto;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoSubmodal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlElement(required = true)
    protected Id id;
    @XmlElement(required = true)
    protected BigInteger idCliente;
    @XmlElement(required = true)
    protected BigInteger idEloDestino;
    @XmlElement(required = true)
    protected BigInteger idEloOrigem;
    protected BigDecimal quantidadeLote;
    @XmlElement(required = true)
    protected BigDecimal quantidadeMassa;

    /**
     * Gets the value of the codigoProduto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * Sets the value of the codigoProduto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoProduto(String value) {
        this.codigoProduto = value;
    }

    /**
     * Gets the value of the codigoSubmodal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoSubmodal() {
        return codigoSubmodal;
    }

    /**
     * Sets the value of the codigoSubmodal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoSubmodal(String value) {
        this.codigoSubmodal = value;
    }

    /**
     * Gets the value of the data property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link Id }
     *
     */
    public Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link Id }
     *
     */
    public void setId(Id value) {
        this.id = value;
    }

    /**
     * Gets the value of the idCliente property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the value of the idCliente property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIdCliente(BigInteger value) {
        this.idCliente = value;
    }

    /**
     * Gets the value of the idEloDestino property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIdEloDestino() {
        return idEloDestino;
    }

    /**
     * Sets the value of the idEloDestino property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIdEloDestino(BigInteger value) {
        this.idEloDestino = value;
    }

    /**
     * Gets the value of the idEloOrigem property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIdEloOrigem() {
        return idEloOrigem;
    }

    /**
     * Sets the value of the idEloOrigem property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIdEloOrigem(BigInteger value) {
        this.idEloOrigem = value;
    }

    /**
     * Gets the value of the quantidadeLote property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getQuantidadeLote() {
        return quantidadeLote;
    }

    /**
     * Sets the value of the quantidadeLote property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setQuantidadeLote(BigDecimal value) {
        this.quantidadeLote = value;
    }

    /**
     * Gets the value of the quantidadeMassa property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getQuantidadeMassa() {
        return quantidadeMassa;
    }

    /**
     * Sets the value of the quantidadeMassa property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setQuantidadeMassa(BigDecimal value) {
        this.quantidadeMassa = value;
    }

}
