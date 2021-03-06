/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.knowledgebase.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.knowledgebase.model.KBFolder;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.InvokableService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

/**
 * Provides the remote service interface for KBFolder. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see KBFolderServiceUtil
 * @see com.liferay.knowledgebase.service.base.KBFolderServiceBaseImpl
 * @see com.liferay.knowledgebase.service.impl.KBFolderServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface KBFolderService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KBFolderServiceUtil} to access the k b folder remote service. Add custom service methods to {@link com.liferay.knowledgebase.service.impl.KBFolderServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public KBFolder addKBFolder(long groupId, long parentResourceClassNameId,
		long parentResourcePrimKey, java.lang.String name,
		java.lang.String description, ServiceContext serviceContext)
		throws PortalException;

	public KBFolder deleteKBFolder(long kbFolderId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public KBFolder fetchKBFolderByUrlTitle(long groupId,
		long parentKbFolderId, java.lang.String urlTitle)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public KBFolder getKBFolder(long kbFolderId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public KBFolder getKBFolderByUrlTitle(long groupId, long parentKbFolderId,
		java.lang.String urlTitle) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<KBFolder> getKBFolders(long groupId, long parentKBFolderId,
		int start, int end) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getKBFoldersCount(long groupId, long parentKBFolderId)
		throws PortalException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public void moveKBFolder(long kbFolderId, long parentKBFolderId)
		throws PortalException;

	public KBFolder updateKBFolder(long parentResourceClassNameId,
		long parentResourcePrimKey, long kbFolderId, java.lang.String name,
		java.lang.String description) throws PortalException;
}