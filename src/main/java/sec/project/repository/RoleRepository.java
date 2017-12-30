package sec.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sec.project.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
