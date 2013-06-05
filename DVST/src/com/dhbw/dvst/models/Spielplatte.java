package com.dhbw.dvst.models;

public class Spielplatte {

	private boolean obenOffen, rechtsOffen, untenOffen, linksOffen;
	
	public Spielplatte(boolean o, boolean r, boolean u, boolean l) {
		this.obenOffen = o;
		this.rechtsOffen = r;
		this.untenOffen = u;
		this.linksOffen = l;
	}
	
	public void nachRechtsDrehen() {
		boolean tempRechts = this.rechtsOffen;
		this.rechtsOffen = this.obenOffen;
		this.obenOffen = this.linksOffen;
		this.linksOffen = this.untenOffen;
		this.untenOffen = tempRechts;
	}
	
	public void nachLinksDrehen() {
		boolean tempOben = this.obenOffen;
		this.obenOffen = this.rechtsOffen;
		this.rechtsOffen = this.untenOffen;
		this.untenOffen = this.linksOffen;
		this.linksOffen = tempOben;
	}

	public boolean isObenOffen() {
		return obenOffen;
	}

	public boolean isRechtsOffen() {
		return rechtsOffen;
	}

	public boolean isUntenOffen() {
		return untenOffen;
	}

	public boolean isLinksOffen() {
		return linksOffen;
	}
}
