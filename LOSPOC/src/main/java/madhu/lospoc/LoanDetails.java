package madhu.lospoc;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class LoanDetails implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(generator = "LOANDETAILS_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "LOANDETAILS_ID_GENERATOR", sequenceName = "LOANDETAILS_ID_SEQ")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("Tenor Months")
   private java.lang.Integer loanTenorMonths;

   @org.kie.api.definition.type.Label("Tenor Years")
   private java.lang.Integer loanTenorYears;

   private java.lang.Long processInstanceID;

   private java.lang.Double downPaymentAmount;

   private java.lang.Double amountRequired;

   private java.lang.Double interestRate;

   private java.lang.String interestRatetype;

   @org.kie.api.definition.type.Label(value = "Minimum Acceptable Loan")
   private java.lang.Double minAcceptableLoan;

   private java.lang.Double projectCost;

   private java.lang.Double emi;

   private java.lang.Double loanAmount;

   public LoanDetails()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.Integer getLoanTenorMonths()
   {
      return this.loanTenorMonths;
   }

   public void setLoanTenorMonths(java.lang.Integer loanTenorMonths)
   {
      this.loanTenorMonths = loanTenorMonths;
   }

   public java.lang.Integer getLoanTenorYears()
   {
      return this.loanTenorYears;
   }

   public void setLoanTenorYears(java.lang.Integer loanTenorYears)
   {
      this.loanTenorYears = loanTenorYears;
   }

   public java.lang.Long getProcessInstanceID()
   {
      return this.processInstanceID;
   }

   public void setProcessInstanceID(java.lang.Long processInstanceID)
   {
      this.processInstanceID = processInstanceID;
   }

   public java.lang.Double getDownPaymentAmount()
   {
      return this.downPaymentAmount;
   }

   public void setDownPaymentAmount(java.lang.Double downPaymentAmount)
   {
      this.downPaymentAmount = downPaymentAmount;
   }

   public java.lang.Double getAmountRequired()
   {
      return this.amountRequired;
   }

   public void setAmountRequired(java.lang.Double amountRequired)
   {
      this.amountRequired = amountRequired;
   }

   public java.lang.Double getInterestRate()
   {
      return this.interestRate;
   }

   public void setInterestRate(java.lang.Double interestRate)
   {
      this.interestRate = interestRate;
   }

   public java.lang.String getInterestRatetype()
   {
      return this.interestRatetype;
   }

   public void setInterestRatetype(java.lang.String interestRatetype)
   {
      this.interestRatetype = interestRatetype;
   }

   public java.lang.Double getMinAcceptableLoan()
   {
      return this.minAcceptableLoan;
   }

   public void setMinAcceptableLoan(java.lang.Double minAcceptableLoan)
   {
      this.minAcceptableLoan = minAcceptableLoan;
   }

   public java.lang.Double getProjectCost()
   {
      return this.projectCost;
   }

   public void setProjectCost(java.lang.Double projectCost)
   {
      this.projectCost = projectCost;
   }

   public java.lang.Double getEmi()
   {
      return this.emi;
   }

   public void setEmi(java.lang.Double emi)
   {
      this.emi = emi;
   }

   public java.lang.Double getLoanAmount()
   {
      return this.loanAmount;
   }

   public void setLoanAmount(java.lang.Double loanAmount)
   {
      this.loanAmount = loanAmount;
   }

   public LoanDetails(java.lang.Long id, java.lang.Integer loanTenorMonths,
         java.lang.Integer loanTenorYears, java.lang.Long processInstanceID,
         java.lang.Double downPaymentAmount, java.lang.Double amountRequired,
         java.lang.Double interestRate, java.lang.String interestRatetype,
         java.lang.Double minAcceptableLoan, java.lang.Double projectCost,
         java.lang.Double emi, java.lang.Double loanAmount)
   {
      this.id = id;
      this.loanTenorMonths = loanTenorMonths;
      this.loanTenorYears = loanTenorYears;
      this.processInstanceID = processInstanceID;
      this.downPaymentAmount = downPaymentAmount;
      this.amountRequired = amountRequired;
      this.interestRate = interestRate;
      this.interestRatetype = interestRatetype;
      this.minAcceptableLoan = minAcceptableLoan;
      this.projectCost = projectCost;
      this.emi = emi;
      this.loanAmount = loanAmount;
   }

}