package com.gap.hellojavadecorator;

public class Nuclear extends HazardDecorator {

	private Parcel parcel;
	
	public Nuclear(Parcel parcel) {
		this.parcel = parcel;
	}
	
	@Override
	public String getDescription() {
		return parcel.getDescription() + ":Nuclear:";
	}

}
