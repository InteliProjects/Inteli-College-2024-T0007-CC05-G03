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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{}capacidadesMaxSobraLotes"/&gt;
 *         &lt;element ref="{}capacidadeMax"/&gt;
 *         &lt;element ref="{}capacidadeMin"/&gt;
 *         &lt;element ref="{}dataInicio"/&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}idElo"/&gt;
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
    "capacidadesMaxSobraLotes",
    "capacidadeMax",
    "capacidadeMin",
    "dataInicio",
    "id",
    "idElo"
})
@XmlRootElement(name = "capacidadesMaxSobraLotes")
public class CapacidadesMaxSobraLotes {

    protected CapacidadesMaxSobraLotes capacidadesMaxSobraLotes;
    protected BigDecimal capacidadeMax;
    protected BigDecimal capacidadeMin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicio;
    protected Id id;
    protected BigInteger idElo;

    /**
     * Gets the value of the capacidadesMaxSobraLotes property.
     *
     * @return
     *     possible object is
     *     {@link CapacidadesMaxSobraLotes }
     *
     */
    public CapacidadesMaxSobraLotes getCapacidadesMaxSobraLotes() {
        return capacidadesMaxSobraLotes;
    }

    /**
     * Sets the value of the capacidadesMaxSobraLotes property.
     *
     * @param value
     *     allowed object is
     *     {@link CapacidadesMaxSobraLotes }
     *
     */
    public void setCapacidadesMaxSobraLotes(CapacidadesMaxSobraLotes value) {
        this.capacidadesMaxSobraLotes = value;
    }

    /**
     * Gets the value of the capacidadeMax property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCapacidadeMax() {
        return capacidadeMax;
    }

    /**
     * Sets the value of the capacidadeMax property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCapacidadeMax(BigDecimal value) {
        this.capacidadeMax = value;
    }

    /**
     * Gets the value of the capacidadeMin property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCapacidadeMin() {
        return capacidadeMin;
    }

    /**
     * Sets the value of the capacidadeMin property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCapacidadeMin(BigDecimal value) {
        this.capacidadeMin = value;
    }

    /**
     * Gets the value of the dataInicio property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDataInicio() {
        return dataInicio;
    }

    /**
     * Sets the value of the dataInicio property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDataInicio(XMLGregorianCalendar value) {
        this.dataInicio = value;
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
     * Gets the value of the idElo property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIdElo() {
        return idElo;
    }

    /**
     * Sets the value of the idElo property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIdElo(BigInteger value) {
        this.idElo = value;
    }

}
