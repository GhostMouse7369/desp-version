package top.laoshuzi.dependencies.publish

import org.gradle.api.Project
import org.gradle.api.artifacts.repositories.MavenArtifactRepository
import org.gradle.api.component.SoftwareComponent
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.get

/**
 * Created by laoshuzi on 2020/12/24.
 */
object MavenPublish {

    fun MavenPublication.mavenPublication(
        groupId: String,
        artifactId: String,
        version: String,
        component: SoftwareComponent
    ) {
        this.groupId = groupId
        this.artifactId = artifactId
        this.version = version
        from(component)
    }

    fun MavenPublication.mavenAndroidPublication(
        project: Project,
        groupId: String = "${project.group}",
        artifactId: String = project.name,
        version: String = "${project.version}"
    ) {
        mavenPublication(
            groupId,
            artifactId,
            version,
            project.components["release"]
        )
    }

    fun MavenPublication.mavenJavaPublication(
        project: Project,
        groupId: String = "${project.group}",
        artifactId: String = project.name,
        version: String = "${project.version}"
    ) {
        mavenPublication(
            groupId,
            artifactId,
            version,
            project.components["java"]
        )
    }

    fun MavenArtifactRepository.mavenRepository(
        project: Project,
        domainName: String,
        userName: String,
        password: String
    ) {
        val releasesRepoUrl = "${domainName}/repository/maven-releases/"
        val snapshotsRepoUrl = "${domainName}/repository/maven-snapshots/"
        url = project.uri(
            if (project.version.toString().endsWith("SNAPSHOT"))
                snapshotsRepoUrl
            else
                releasesRepoUrl
        )
        credentials {
            this.username = userName
            this.password = password
        }
    }
}



