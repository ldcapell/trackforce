package com.revature.entity;
// Generated Nov 7, 2017 9:24:46 PM by Hibernate Tools 5.2.5.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TfEndClient generated by hbm2java
 */
@Entity
@Table(name = "TF_END_CLIENT", schema = "ADMIN")
public class TfEndClient implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8077675564245631804L;
	private BigDecimal tfEndClientId;
	private String tfEndClientName;
	private Set<TfAssociate> tfAssociates = new HashSet<TfAssociate>(0);
	private Set<TfPlacement> tfPlacements = new HashSet<TfPlacement>(0);
	private Set<TfInterview> tfInterviews = new HashSet<TfInterview>(0);

	public TfEndClient() {
	}

	public TfEndClient(BigDecimal tfEndClientId) {
		this.tfEndClientId = tfEndClientId;
	}

	public TfEndClient(BigDecimal tfEndClientId, String tfEndClientName, Set<TfAssociate> tfAssociates,
			Set<TfPlacement> tfPlacements, Set<TfInterview> tfInterviews) {
		this.tfEndClientId = tfEndClientId;
		this.tfEndClientName = tfEndClientName;
		this.tfAssociates = tfAssociates;
		this.tfPlacements = tfPlacements;
		this.tfInterviews = tfInterviews;
	}

	@Id

	@Column(name = "TF_END_CLIENT_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getTfEndClientId() {
		return this.tfEndClientId;
	}

	public void setTfEndClientId(BigDecimal tfEndClientId) {
		this.tfEndClientId = tfEndClientId;
	}

	@Column(name = "TF_END_CLIENT_NAME", length = 100)
	public String getTfEndClientName() {
		return this.tfEndClientName;
	}

	public void setTfEndClientName(String tfEndClientName) {
		this.tfEndClientName = tfEndClientName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tfEndClient")
	public Set<TfAssociate> getTfAssociates() {
		return this.tfAssociates;
	}

	public void setTfAssociates(Set<TfAssociate> tfAssociates) {
		this.tfAssociates = tfAssociates;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tfEndClient")
	public Set<TfPlacement> getTfPlacements() {
		return this.tfPlacements;
	}

	public void setTfPlacements(Set<TfPlacement> tfPlacements) {
		this.tfPlacements = tfPlacements;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tfEndClient")
	public Set<TfInterview> getTfInterviews() {
		return this.tfInterviews;
	}

	public void setTfInterviews(Set<TfInterview> tfInterviews) {
		this.tfInterviews = tfInterviews;
	}

    @Override
    public String toString() {
        return "TfEndClient [tfEndClientId=" + tfEndClientId + ", tfEndClientName=" + tfEndClientName
                + ", tfAssociates=" + tfAssociates + ", tfPlacements=" + tfPlacements + ", tfInterviews=" + tfInterviews
                + "]";
    }

}
