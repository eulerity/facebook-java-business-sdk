package com.facebook.ads.sdk;

public class ByteArrayParam {
	private String name;
	private byte[] bytes;
	private String contentType;

	public ByteArrayParam(String name, String contentType, byte[] bytes) {
		this.name = name;
		this.contentType = contentType;
		this.bytes = bytes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
