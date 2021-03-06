/**
 * 
 */
package gov.nasa.api.model;

import java.io.Serializable;

/**
 * @author kvyas
 *
 */
public class SoundApiResponseModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	String description;
	String license;
	String id;
	String stream_url;
	String tag_list;
	String duration;
	String download_url;
	String title;
	String last_modified;

	public SoundApiResponseModel() {
		
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStream_url() {
		return stream_url;
	}
	public void setStream_url(String stream_url) {
		this.stream_url = stream_url;
	}
	public String getTag_list() {
		return tag_list;
	}
	public void setTag_list(String tag_list) {
		this.tag_list = tag_list;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDownload_url() {
		return download_url;
	}
	public void setDownload_url(String download_url) {
		this.download_url = download_url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLast_modified() {
		return last_modified;
	}
	public void setLast_modified(String last_modified) {
		this.last_modified = last_modified;
	}
	

}
