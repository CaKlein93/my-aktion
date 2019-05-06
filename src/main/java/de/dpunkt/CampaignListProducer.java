package de.dpunkt;

import de.dpunkt.Account;
import de.dpunkt.Donation.Status;
import de.dpunkt.*;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.enterprise.context.*;
import javax.inject.Named;


@SessionScoped
@Named
public class CampaignListProducer implements Serializable {
	private static final long serialVersionUID = -182866064791747156L;
	private List<Campaign> campaigns;
	
	
	
	public CampaignListProducer() {
		campaigns = createMockCampaigns();
	}
	public List<Campaign> getCampaigns() {
		return campaigns;
	}
	public void setCampaigns(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}
	
	public List<Campaign> createMockCampaigns(){
		Donation donation1 = new Donation();
		donation1.setDonorName("Leonard Ihle");
		donation1.setAmount(20);
		donation1.setReceiptRequested(true);
		donation1.setStatus(Status.TRANSFERRED);
		donation1.setAccount(new Account(donation1.getDonorName(), "Kreissparkasse Reutlingen", "DE354341445523"));
		
		Donation donation2 = new Donation();
		donation2.setDonorName("Timo Strobel");
		donation2.setAmount(1);
		donation2.setReceiptRequested(true);
		donation2.setStatus(Status.IN_PROCESS);
		donation2.setAccount(new Account(donation1.getDonorName(), "Kreissparkasse Tübingen", "DE35324443423"));
		
		Donation donation3 = new Donation();
		donation2.setDonorName("Denesa Zyberaj");
		donation2.setAmount(622544);
		donation2.setReceiptRequested(true);
		donation2.setStatus(Status.TRANSFERRED);
		donation2.setAccount(new Account(donation1.getDonorName(), "Volksbank Reutlingen", "DE3532436773423"));
		
		List<Donation> spenden = new LinkedList<>();
		spenden.add(donation1);
		spenden.add(donation2);
		spenden.add(donation3);
		
		Campaign campaign1 = new Campaign();
		campaign1.setName("Bierspende");
		campaign1.setTargetAmount(1000d);
		campaign1.setAmountDonatedSoFar(742d);
		campaign1.setDonationMinimum(20d);
		campaign1.setId(1L);
		campaign1.setAccount(new Account("Max Mustermann", "ABC Bank", "DE434343"));
		campaign1.setDonations(spenden);
		
		Campaign campaign2 = new Campaign();
		campaign2.setName("Spende für dies und das");
		campaign2.setTargetAmount(1000d);
		campaign2.setAmountDonatedSoFar(742d);
		campaign2.setDonationMinimum(20d);
		campaign2.setId(2L);
		campaign2.setAccount(campaign1.getAccount());
		campaign2.setDonations(spenden);
		
		List<Campaign> ret = new LinkedList<>();
		ret.add(campaign1);
		ret.add(campaign2);
		return ret;
		 
		
		
		
		
					
	}
	
	
	
	
	

	
}
