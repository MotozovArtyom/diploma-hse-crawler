package ru.hse.diploma.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Модель Веб-страницы.
 *
 * @author Artem Motozov
 * @since 2021.04.29
 */
@Document(collection = "web_pages")
public class WebPage extends DomainObject {
	/**
	 * URL веб-страницы.
	 */
	@Field("url")
	private String url;

	/**
	 * Ресурс веб-страницы.
	 */
	@Field("resource_name")
	private String resourceName;

	/**
	 * Метаданные веб-страницы.
	 */
	@Field("meta_data")
	private String metaData;

	/**
	 * Заголовок веб-страницы.
	 */
	@Field("head")
	private String head;

	/**
	 * HTML страница.
	 */
	@Field("page_text")
	private String pageText;

	/**
	 * Идентификатор Веб-портала.
	 */
	@Field("web_portal")
	private String webPortalId;

	/**
	 * Идентификатор Результата анализа веб-страницы.
	 */
	@Field("web_page_analyse_result")
	private String webPageAnalyseResultId;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getMetaData() {
		return metaData;
	}

	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getPageText() {
		return pageText;
	}

	public void setPageText(String pageText) {
		this.pageText = pageText;
	}

	public String getWebPortalId() {
		return webPortalId;
	}

	public void setWebPortalId(String webPortalId) {
		this.webPortalId = webPortalId;
	}

	public String getWebPageAnalyseResultId() {
		return webPageAnalyseResultId;
	}

	public void setWebPageAnalyseResultId(String webPageAnalyseResultId) {
		this.webPageAnalyseResultId = webPageAnalyseResultId;
	}

	@Override
	public String toString() {
		return "WebPage{" +
				"id='" + id + '\'' +
				", url='" + url + '\'' +
				", resourceName='" + resourceName + '\'' +
				", metaData='" + metaData + '\'' +
				", head='" + head + '\'' +
				", pageText='" + pageText + '\'' +
				", webPortalId='" + webPortalId + '\'' +
				", webPageAnalyseResultId='" + webPageAnalyseResultId + '\'' +
				", creationTime=" + creationTime +
				", lastModifiedTime=" + lastModifiedTime +
				", ts=" + ts +
				'}';
	}
}
