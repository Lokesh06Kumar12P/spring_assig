package com.Omnify.Assignment.Reposistory;

import com.Omnify.Assignment.Entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<Blog,Integer> {
}
