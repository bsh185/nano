// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01.tracks;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import com.amazon.webservices.awsecommerceservice._2011_08_01.tracks.disc.Track;
import java.math.BigInteger;
import java.util.List;

public class Disc implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Track")
	@Order(value=0)
	public List<Track> track;	
	
	@Attribute(name = "Number")
	@Order(value=1)
	public BigInteger number;	
	
    
}