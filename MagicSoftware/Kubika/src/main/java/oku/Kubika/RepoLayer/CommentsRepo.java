package oku.Kubika.RepoLayer;

import oku.Kubika.Kubico.Components.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepo extends JpaRepository<Comments, Integer> {
}
