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
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}valorCriticidadeViolacaoLimiteMaximo" minOccurs="0"/&gt;
 *         &lt;element ref="{}valorCriticidadeViolacaoLimiteMinimo" minOccurs="0"/&gt;
 *         &lt;element ref="{}valorLimiteMaximo" minOccurs="0"/&gt;
 *         &lt;element ref="{}valorLimiteMinimo" minOccurs="0"/&gt;
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
    "id",
    "valorCriticidadeViolacaoLimiteMaximo",
    "valorCriticidadeViolacaoLimiteMinimo",
    "valorLimiteMaximo",
    "valorLimiteMinimo"
})
@XmlRootElement(name = "grandezaEnsaioMapaAnaliseAPS")
public class GrandezaEnsaioMapaAnaliseAPS {

    @XmlElement(required = true)
    protected Id id;
    protected BigInteger valorCriticidadeViolacaoLimiteMaximo;
    protected BigInteger valorCriticidadeViolacaoLimiteMinimo;
    protected BigDecimal valorLimiteMaximo;
    protected BigDecimal valorLimiteMinimo;

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
     * Gets the value of the valorCriticidadeViolacaoLimiteMaximo property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getValorCriticidadeViolacaoLimiteMaximo() {
        return valorCriticidadeViolacaoLimiteMaximo;
    }

    /**
     * Sets the value of the valorCriticidadeViolacaoLimiteMaximo property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setValorCriticidadeViolacaoLimiteMaximo(BigInteger value) {
        this.valorCriticidadeViolacaoLimiteMaximo = value;
    }

    /**
     * Gets the value of the valorCriticidadeViolacaoLimiteMinimo property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getValorCriticidadeViolacaoLimiteMinimo() {
        return valorCriticidadeViolacaoLimiteMinimo;
    }

    /**
     * Sets the value of the valorCriticidadeViolacaoLimiteMinimo property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setValorCriticidadeViolacaoLimiteMinimo(BigInteger value) {
        this.valorCriticidadeViolacaoLimiteMinimo = value;
    }

    /**
     * Gets the value of the valorLimiteMaximo property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValorLimiteMaximo() {
        return valorLimiteMaximo;
    }

    /**
     * Sets the value of the valorLimiteMaximo property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValorLimiteMaximo(BigDecimal value) {
        this.valorLimiteMaximo = value;
    }

    /**
     * Gets the value of the valorLimiteMinimo property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValorLimiteMinimo() {
        return valorLimiteMinimo;
    }

    /**
     * Sets the value of the valorLimiteMinimo property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValorLimiteMinimo(BigDecimal value) {
        this.valorLimiteMinimo = value;
    }

}