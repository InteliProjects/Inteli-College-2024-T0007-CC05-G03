//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.02.22 at 08:27:36 PM UTC
//


package inteli.xml.sudeste;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}capacidadeVazaoSubModal"/&gt;
 *         &lt;element ref="{}codigoSubModal" minOccurs="0"/&gt;
 *         &lt;element ref="{}considerarCapacidade"/&gt;
 *         &lt;element ref="{}descricao"/&gt;
 *         &lt;element ref="{}habilitarRestricao"/&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}subRedePrioritaria"/&gt;
 *         &lt;element ref="{}unidadeMedidaTempo"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{}variacoesCapacidadeVazaoTrecho"/&gt;
 *           &lt;element ref="{}vazoesObrigatorias"/&gt;
 *         &lt;/choice&gt;
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
    "capacidadeVazaoSubModal",
    "codigoSubModal",
    "considerarCapacidade",
    "descricao",
    "habilitarRestricao",
    "id",
    "subRedePrioritaria",
    "unidadeMedidaTempo",
    "variacoesCapacidadeVazaoTrecho",
    "vazoesObrigatorias"
})
@XmlRootElement(name = "subRedeTransporte")
public class SubRedeTransporte {

    @XmlElement(required = true)
    protected BigDecimal capacidadeVazaoSubModal;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoSubModal;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String considerarCapacidade;
    @XmlElement(required = true)
    protected String descricao;
    protected boolean habilitarRestricao;
    @XmlElement(required = true)
    protected Id id;
    protected boolean subRedePrioritaria;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String unidadeMedidaTempo;
    protected VariacoesCapacidadeVazaoTrecho variacoesCapacidadeVazaoTrecho;
    protected VazoesObrigatorias vazoesObrigatorias;

    /**
     * Gets the value of the capacidadeVazaoSubModal property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCapacidadeVazaoSubModal() {
        return capacidadeVazaoSubModal;
    }

    /**
     * Sets the value of the capacidadeVazaoSubModal property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCapacidadeVazaoSubModal(BigDecimal value) {
        this.capacidadeVazaoSubModal = value;
    }

    /**
     * Gets the value of the codigoSubModal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoSubModal() {
        return codigoSubModal;
    }

    /**
     * Sets the value of the codigoSubModal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoSubModal(String value) {
        this.codigoSubModal = value;
    }

    /**
     * Gets the value of the considerarCapacidade property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getConsiderarCapacidade() {
        return considerarCapacidade;
    }

    /**
     * Sets the value of the considerarCapacidade property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setConsiderarCapacidade(String value) {
        this.considerarCapacidade = value;
    }

    /**
     * Gets the value of the descricao property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the habilitarRestricao property.
     *
     */
    public boolean isHabilitarRestricao() {
        return habilitarRestricao;
    }

    /**
     * Sets the value of the habilitarRestricao property.
     *
     */
    public void setHabilitarRestricao(boolean value) {
        this.habilitarRestricao = value;
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
     * Gets the value of the subRedePrioritaria property.
     *
     */
    public boolean isSubRedePrioritaria() {
        return subRedePrioritaria;
    }

    /**
     * Sets the value of the subRedePrioritaria property.
     *
     */
    public void setSubRedePrioritaria(boolean value) {
        this.subRedePrioritaria = value;
    }

    /**
     * Gets the value of the unidadeMedidaTempo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnidadeMedidaTempo() {
        return unidadeMedidaTempo;
    }

    /**
     * Sets the value of the unidadeMedidaTempo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnidadeMedidaTempo(String value) {
        this.unidadeMedidaTempo = value;
    }

    /**
     * Gets the value of the variacoesCapacidadeVazaoTrecho property.
     *
     * @return
     *     possible object is
     *     {@link VariacoesCapacidadeVazaoTrecho }
     *
     */
    public VariacoesCapacidadeVazaoTrecho getVariacoesCapacidadeVazaoTrecho() {
        return variacoesCapacidadeVazaoTrecho;
    }

    /**
     * Sets the value of the variacoesCapacidadeVazaoTrecho property.
     *
     * @param value
     *     allowed object is
     *     {@link VariacoesCapacidadeVazaoTrecho }
     *
     */
    public void setVariacoesCapacidadeVazaoTrecho(VariacoesCapacidadeVazaoTrecho value) {
        this.variacoesCapacidadeVazaoTrecho = value;
    }

    /**
     * Gets the value of the vazoesObrigatorias property.
     *
     * @return
     *     possible object is
     *     {@link VazoesObrigatorias }
     *
     */
    public VazoesObrigatorias getVazoesObrigatorias() {
        return vazoesObrigatorias;
    }

    /**
     * Sets the value of the vazoesObrigatorias property.
     *
     * @param value
     *     allowed object is
     *     {@link VazoesObrigatorias }
     *
     */
    public void setVazoesObrigatorias(VazoesObrigatorias value) {
        this.vazoesObrigatorias = value;
    }

}
