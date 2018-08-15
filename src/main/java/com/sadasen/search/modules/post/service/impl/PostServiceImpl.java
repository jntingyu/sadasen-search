package com.sadasen.search.modules.post.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadasen.search.modules.post.dao.PostDao;
import com.sadasen.search.modules.post.entity.Post;
import com.sadasen.search.modules.post.service.PostService;

/**
 * @date 2018年8月16日
 * @author lei.ys
 * @addr home
 * @desc
 */
@Service
public class PostServiceImpl implements PostService {
	
	@Autowired
	private PostDao postDao;

	@Override
	public Post save(Post post) {
		postDao.insertTemplate(post, true);
		return post;
	}

}
