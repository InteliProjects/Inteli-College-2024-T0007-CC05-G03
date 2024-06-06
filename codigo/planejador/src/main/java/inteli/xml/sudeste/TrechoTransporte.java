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
 *         &lt;element ref="{}considerarAtendimento"/&gt;
 *         &lt;element ref="{}considerarCapacidade"/&gt;
 *         &lt;element ref="{}descricao"/&gt;
 *         &lt;element ref="{}habilitarRestricao"/&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}idSistemaProducao"/&gt;
 *         &lt;element ref="{}indicadorUnidadeMedidaTempoPercurso"/&gt;
 *         &lt;element ref="{}interSistema"/&gt;
 *         &lt;element ref="{}tempoPercurso"/&gt;
 *         &lt;element ref="{}variacoesCapacidadeVazaoTrecho" minOccurs="0"/&gt;
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
    "considerarAtendimento",
    "considerarCapacidade",
    "descricao",
    "habilitarRestricao",
    "id",
    "idSistemaProducao",
    "indicadorUnidadeMedidaTempoPercurso",
    "interSistema",
    "tempoPercurso",
    "variacoesCapacidadeVazaoTrecho"
})
@XmlRootElement(name = "trechoTransporte")
public class TrechoTransporte {

    protected boolean considerarAtendimento;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String considerarCapacidade;
    @XmlElement(required = true)
    protected String descricao;
    protected boolean habilitarRestricao;
    @XmlElement(required = true)
    protected Id id;
    @XmlElement(required = true)
    protected BigInteger idSistemaProducao;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String indicadorUnidadeMedidaTempoPercurso;
    protected boolean interSistema;
    @XmlElement(required = true)
    protected BigDecimal tempoPercurso;
    protected VariacoesCapacidadeVazaoTrecho variacoesCapacidadeVazaoTrecho;

    /**
     * Gets the value of the considerarAtendimento property.
     *
     */
    public boolean isConsiderarAtendimento() {
        return considerarAtendimento;
    }

    /**
     * Sets the value of the considerarAtendimento property.
     *
     */
    public void setConsiderarAtendimento(boolean value) {
        this.considerarAtendimento = value;
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
     * Gets the value of the idSistemaProducao property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIdSistemaProducao() {
        return idSistemaProducao;
    }

    /**
     * Sets the value of the idSistemaProducao property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIdSistemaProducao(BigInteger value) {
        this.idSistemaProducao = value;
    }

    /**
     * Gets the value of the indicadorUnidadeMedidaTempoPercurso property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIndicadorUnidadeMedidaTempoPercurso() {
        return indicadorUnidadeMedidaTempoPercurso;
    }

    /**
     * Sets the value of the indicadorUnidadeMedidaTempoPercurso property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIndicadorUnidadeMedidaTempoPercurso(String value) {
        this.indicadorUnidadeMedidaTempoPercurso = value;
    }

    /**
     * Gets the value of the interSistema property.
     *
     */
    public boolean isInterSistema() {
        return interSistema;
    }

    /**
     * Sets the value of the interSistema property.
     *
     */
    public void setInterSistema(boolean value) {
        this.interSistema = value;
    }

    /**
     * Gets the value of the tempoPercurso property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTempoPercurso() {
        return tempoPercurso;
    }

    /**
     * Sets the value of the tempoPercurso property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTempoPercurso(BigDecimal value) {
        this.tempoPercurso = value;
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

}
