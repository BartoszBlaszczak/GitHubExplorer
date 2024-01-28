package hex.githubexplorer

const val GET_REPOSITORIES_RESPONSE = """
[
  {
    "id": 313093850,
    "node_id": "MDEwOlJlcG9zaXRvcnkzMTMwOTM4NTA=",
    "name": "first",
    "full_name": "BartoszBlaszczak/first",
    "private": false,
    "owner": {
      "login": "BartoszBlaszczak",
      "id": 20843613,
      "node_id": "MDQ6VXNlcjIwODQzNjEz",
      "avatar_url": "https://avatars.githubusercontent.com/u/20843613?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/BartoszBlaszczak",
      "html_url": "https://github.com/BartoszBlaszczak",
      "followers_url": "https://api.github.com/users/BartoszBlaszczak/followers",
      "following_url": "https://api.github.com/users/BartoszBlaszczak/following{/other_user}",
      "gists_url": "https://api.github.com/users/BartoszBlaszczak/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/BartoszBlaszczak/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/BartoszBlaszczak/subscriptions",
      "organizations_url": "https://api.github.com/users/BartoszBlaszczak/orgs",
      "repos_url": "https://api.github.com/users/BartoszBlaszczak/repos",
      "events_url": "https://api.github.com/users/BartoszBlaszczak/events{/privacy}",
      "received_events_url": "https://api.github.com/users/BartoszBlaszczak/received_events",
      "type": "User",
      "site_admin": false
    },
    "html_url": "https://github.com/BartoszBlaszczak/first",
    "description": null,
    "fork": false,
    "url": "https://api.github.com/repos/BartoszBlaszczak/first",
    "forks_url": "https://api.github.com/repos/BartoszBlaszczak/first/forks",
    "keys_url": "https://api.github.com/repos/BartoszBlaszczak/first/keys{/key_id}",
    "collaborators_url": "https://api.github.com/repos/BartoszBlaszczak/first/collaborators{/collaborator}",
    "teams_url": "https://api.github.com/repos/BartoszBlaszczak/first/teams",
    "hooks_url": "https://api.github.com/repos/BartoszBlaszczak/first/hooks",
    "issue_events_url": "https://api.github.com/repos/BartoszBlaszczak/first/issues/events{/number}",
    "events_url": "https://api.github.com/repos/BartoszBlaszczak/first/events",
    "assignees_url": "https://api.github.com/repos/BartoszBlaszczak/first/assignees{/user}",
    "branches_url": "https://api.github.com/repos/BartoszBlaszczak/first/branches{/branch}",
    "tags_url": "https://api.github.com/repos/BartoszBlaszczak/first/tags",
    "blobs_url": "https://api.github.com/repos/BartoszBlaszczak/first/git/blobs{/sha}",
    "git_tags_url": "https://api.github.com/repos/BartoszBlaszczak/first/git/tags{/sha}",
    "git_refs_url": "https://api.github.com/repos/BartoszBlaszczak/first/git/refs{/sha}",
    "trees_url": "https://api.github.com/repos/BartoszBlaszczak/first/git/trees{/sha}",
    "statuses_url": "https://api.github.com/repos/BartoszBlaszczak/first/statuses/{sha}",
    "languages_url": "https://api.github.com/repos/BartoszBlaszczak/first/languages",
    "stargazers_url": "https://api.github.com/repos/BartoszBlaszczak/first/stargazers",
    "contributors_url": "https://api.github.com/repos/BartoszBlaszczak/first/contributors",
    "subscribers_url": "https://api.github.com/repos/BartoszBlaszczak/first/subscribers",
    "subscription_url": "https://api.github.com/repos/BartoszBlaszczak/first/subscription",
    "commits_url": "https://api.github.com/repos/BartoszBlaszczak/first/commits{/sha}",
    "git_commits_url": "https://api.github.com/repos/BartoszBlaszczak/first/git/commits{/sha}",
    "comments_url": "https://api.github.com/repos/BartoszBlaszczak/first/comments{/number}",
    "issue_comment_url": "https://api.github.com/repos/BartoszBlaszczak/first/issues/comments{/number}",
    "contents_url": "https://api.github.com/repos/BartoszBlaszczak/first/contents/{+path}",
    "compare_url": "https://api.github.com/repos/BartoszBlaszczak/first/compare/{base}...{head}",
    "merges_url": "https://api.github.com/repos/BartoszBlaszczak/first/merges",
    "archive_url": "https://api.github.com/repos/BartoszBlaszczak/first/{archive_format}{/ref}",
    "downloads_url": "https://api.github.com/repos/BartoszBlaszczak/first/downloads",
    "issues_url": "https://api.github.com/repos/BartoszBlaszczak/first/issues{/number}",
    "pulls_url": "https://api.github.com/repos/BartoszBlaszczak/first/pulls{/number}",
    "milestones_url": "https://api.github.com/repos/BartoszBlaszczak/first/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/BartoszBlaszczak/first/notifications{?since,all,participating}",
    "labels_url": "https://api.github.com/repos/BartoszBlaszczak/first/labels{/name}",
    "releases_url": "https://api.github.com/repos/BartoszBlaszczak/first/releases{/id}",
    "deployments_url": "https://api.github.com/repos/BartoszBlaszczak/first/deployments",
    "created_at": "2020-11-15T18:14:03Z",
    "updated_at": "2020-11-15T18:15:39Z",
    "pushed_at": "2020-11-15T18:15:35Z",
    "git_url": "git://github.com/BartoszBlaszczak/first.git",
    "ssh_url": "git@github.com:BartoszBlaszczak/first.git",
    "clone_url": "https://github.com/BartoszBlaszczak/first.git",
    "svn_url": "https://github.com/BartoszBlaszczak/first",
    "homepage": null,
    "size": 66,
    "stargazers_count": 0,
    "watchers_count": 0,
    "language": "Java",
    "has_issues": true,
    "has_projects": true,
    "has_downloads": true,
    "has_wiki": true,
    "has_pages": false,
    "has_discussions": false,
    "forks_count": 0,
    "mirror_url": null,
    "archived": false,
    "disabled": false,
    "open_issues_count": 0,
    "license": null,
    "allow_forking": true,
    "is_template": false,
    "web_commit_signoff_required": false,
    "topics": [],
    "visibility": "public",
    "forks": 0,
    "open_issues": 0,
    "watchers": 0,
    "default_branch": "feature/dev"
  },
  {
    "id": 374328552,
    "node_id": "MDEwOlJlcG9zaXRvcnkzNzQzMjg1NTI=",
    "name": "second",
    "full_name": "BartoszBlaszczak/second",
    "private": false,
    "owner": {
      "login": "BartoszBlaszczak",
      "id": 20843613,
      "node_id": "MDQ6VXNlcjIwODQzNjEz",
      "avatar_url": "https://avatars.githubusercontent.com/u/20843613?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/BartoszBlaszczak",
      "html_url": "https://github.com/BartoszBlaszczak",
      "followers_url": "https://api.github.com/users/BartoszBlaszczak/followers",
      "following_url": "https://api.github.com/users/BartoszBlaszczak/following{/other_user}",
      "gists_url": "https://api.github.com/users/BartoszBlaszczak/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/BartoszBlaszczak/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/BartoszBlaszczak/subscriptions",
      "organizations_url": "https://api.github.com/users/BartoszBlaszczak/orgs",
      "repos_url": "https://api.github.com/users/BartoszBlaszczak/repos",
      "events_url": "https://api.github.com/users/BartoszBlaszczak/events{/privacy}",
      "received_events_url": "https://api.github.com/users/BartoszBlaszczak/received_events",
      "type": "User",
      "site_admin": false
    },
    "html_url": "https://github.com/BartoszBlaszczak/second",
    "description": null,
    "fork": false,
    "url": "https://api.github.com/repos/BartoszBlaszczak/second",
    "forks_url": "https://api.github.com/repos/BartoszBlaszczak/second/forks",
    "keys_url": "https://api.github.com/repos/BartoszBlaszczak/second/keys{/key_id}",
    "collaborators_url": "https://api.github.com/repos/BartoszBlaszczak/second/collaborators{/collaborator}",
    "teams_url": "https://api.github.com/repos/BartoszBlaszczak/second/teams",
    "hooks_url": "https://api.github.com/repos/BartoszBlaszczak/second/hooks",
    "issue_events_url": "https://api.github.com/repos/BartoszBlaszczak/second/issues/events{/number}",
    "events_url": "https://api.github.com/repos/BartoszBlaszczak/second/events",
    "assignees_url": "https://api.github.com/repos/BartoszBlaszczak/second/assignees{/user}",
    "branches_url": "https://api.github.com/repos/BartoszBlaszczak/second/branches{/branch}",
    "tags_url": "https://api.github.com/repos/BartoszBlaszczak/second/tags",
    "blobs_url": "https://api.github.com/repos/BartoszBlaszczak/second/git/blobs{/sha}",
    "git_tags_url": "https://api.github.com/repos/BartoszBlaszczak/second/git/tags{/sha}",
    "git_refs_url": "https://api.github.com/repos/BartoszBlaszczak/second/git/refs{/sha}",
    "trees_url": "https://api.github.com/repos/BartoszBlaszczak/second/git/trees{/sha}",
    "statuses_url": "https://api.github.com/repos/BartoszBlaszczak/second/statuses/{sha}",
    "languages_url": "https://api.github.com/repos/BartoszBlaszczak/second/languages",
    "stargazers_url": "https://api.github.com/repos/BartoszBlaszczak/second/stargazers",
    "contributors_url": "https://api.github.com/repos/BartoszBlaszczak/second/contributors",
    "subscribers_url": "https://api.github.com/repos/BartoszBlaszczak/second/subscribers",
    "subscription_url": "https://api.github.com/repos/BartoszBlaszczak/second/subscription",
    "commits_url": "https://api.github.com/repos/BartoszBlaszczak/second/commits{/sha}",
    "git_commits_url": "https://api.github.com/repos/BartoszBlaszczak/second/git/commits{/sha}",
    "comments_url": "https://api.github.com/repos/BartoszBlaszczak/second/comments{/number}",
    "issue_comment_url": "https://api.github.com/repos/BartoszBlaszczak/second/issues/comments{/number}",
    "contents_url": "https://api.github.com/repos/BartoszBlaszczak/second/contents/{+path}",
    "compare_url": "https://api.github.com/repos/BartoszBlaszczak/second/compare/{base}...{head}",
    "merges_url": "https://api.github.com/repos/BartoszBlaszczak/second/merges",
    "archive_url": "https://api.github.com/repos/BartoszBlaszczak/second/{archive_format}{/ref}",
    "downloads_url": "https://api.github.com/repos/BartoszBlaszczak/second/downloads",
    "issues_url": "https://api.github.com/repos/BartoszBlaszczak/second/issues{/number}",
    "pulls_url": "https://api.github.com/repos/BartoszBlaszczak/second/pulls{/number}",
    "milestones_url": "https://api.github.com/repos/BartoszBlaszczak/second/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/BartoszBlaszczak/second/notifications{?since,all,participating}",
    "labels_url": "https://api.github.com/repos/BartoszBlaszczak/second/labels{/name}",
    "releases_url": "https://api.github.com/repos/BartoszBlaszczak/second/releases{/id}",
    "deployments_url": "https://api.github.com/repos/BartoszBlaszczak/second/deployments",
    "created_at": "2021-06-06T10:17:08Z",
    "updated_at": "2022-04-25T21:17:18Z",
    "pushed_at": "2024-01-01T10:07:09Z",
    "git_url": "git://github.com/BartoszBlaszczak/second.git",
    "ssh_url": "git@github.com:BartoszBlaszczak/second.git",
    "clone_url": "https://github.com/BartoszBlaszczak/second.git",
    "svn_url": "https://github.com/BartoszBlaszczak/second",
    "homepage": "https://second.dev",
    "size": 767,
    "stargazers_count": 1,
    "watchers_count": 1,
    "language": "HTML",
    "has_issues": true,
    "has_projects": true,
    "has_downloads": true,
    "has_wiki": true,
    "has_pages": false,
    "has_discussions": false,
    "forks_count": 0,
    "mirror_url": null,
    "archived": false,
    "disabled": false,
    "open_issues_count": 0,
    "license": {
      "key": "mit",
      "name": "MIT License",
      "spdx_id": "MIT",
      "url": "https://api.github.com/licenses/mit",
      "node_id": "MDc6TGljZW5zZTEz"
    },
    "allow_forking": true,
    "is_template": false,
    "web_commit_signoff_required": false,
    "topics": [],
    "visibility": "public",
    "forks": 0,
    "open_issues": 0,
    "watchers": 1,
    "default_branch": "master"
  },
  {
    "id": 382707297,
    "node_id": "MDEwOlJlcG9zaXRvcnkzODI3MDcyOTc=",
    "name": "third",
    "full_name": "BartoszBlaszczak/third",
    "private": false,
    "owner": {
      "login": "BartoszBlaszczak",
      "id": 20843613,
      "node_id": "MDQ6VXNlcjIwODQzNjEz",
      "avatar_url": "https://avatars.githubusercontent.com/u/20843613?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/BartoszBlaszczak",
      "html_url": "https://github.com/BartoszBlaszczak",
      "followers_url": "https://api.github.com/users/BartoszBlaszczak/followers",
      "following_url": "https://api.github.com/users/BartoszBlaszczak/following{/other_user}",
      "gists_url": "https://api.github.com/users/BartoszBlaszczak/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/BartoszBlaszczak/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/BartoszBlaszczak/subscriptions",
      "organizations_url": "https://api.github.com/users/BartoszBlaszczak/orgs",
      "repos_url": "https://api.github.com/users/BartoszBlaszczak/repos",
      "events_url": "https://api.github.com/users/BartoszBlaszczak/events{/privacy}",
      "received_events_url": "https://api.github.com/users/BartoszBlaszczak/received_events",
      "type": "User",
      "site_admin": false
    },
    "html_url": "https://github.com/BartoszBlaszczak/third",
    "description": "JVM Bloggers - website and newsletter with JVM blogs from Poland",
    "fork": true,
    "url": "https://api.github.com/repos/BartoszBlaszczak/third",
    "forks_url": "https://api.github.com/repos/BartoszBlaszczak/third/forks",
    "keys_url": "https://api.github.com/repos/BartoszBlaszczak/third/keys{/key_id}",
    "collaborators_url": "https://api.github.com/repos/BartoszBlaszczak/third/collaborators{/collaborator}",
    "teams_url": "https://api.github.com/repos/BartoszBlaszczak/third/teams",
    "hooks_url": "https://api.github.com/repos/BartoszBlaszczak/third/hooks",
    "issue_events_url": "https://api.github.com/repos/BartoszBlaszczak/third/issues/events{/number}",
    "events_url": "https://api.github.com/repos/BartoszBlaszczak/third/events",
    "assignees_url": "https://api.github.com/repos/BartoszBlaszczak/third/assignees{/user}",
    "branches_url": "https://api.github.com/repos/BartoszBlaszczak/third/branches{/branch}",
    "tags_url": "https://api.github.com/repos/BartoszBlaszczak/third/tags",
    "blobs_url": "https://api.github.com/repos/BartoszBlaszczak/third/git/blobs{/sha}",
    "git_tags_url": "https://api.github.com/repos/BartoszBlaszczak/third/git/tags{/sha}",
    "git_refs_url": "https://api.github.com/repos/BartoszBlaszczak/third/git/refs{/sha}",
    "trees_url": "https://api.github.com/repos/BartoszBlaszczak/third/git/trees{/sha}",
    "statuses_url": "https://api.github.com/repos/BartoszBlaszczak/third/statuses/{sha}",
    "languages_url": "https://api.github.com/repos/BartoszBlaszczak/third/languages",
    "stargazers_url": "https://api.github.com/repos/BartoszBlaszczak/third/stargazers",
    "contributors_url": "https://api.github.com/repos/BartoszBlaszczak/third/contributors",
    "subscribers_url": "https://api.github.com/repos/BartoszBlaszczak/third/subscribers",
    "subscription_url": "https://api.github.com/repos/BartoszBlaszczak/third/subscription",
    "commits_url": "https://api.github.com/repos/BartoszBlaszczak/third/commits{/sha}",
    "git_commits_url": "https://api.github.com/repos/BartoszBlaszczak/third/git/commits{/sha}",
    "comments_url": "https://api.github.com/repos/BartoszBlaszczak/third/comments{/number}",
    "issue_comment_url": "https://api.github.com/repos/BartoszBlaszczak/third/issues/comments{/number}",
    "contents_url": "https://api.github.com/repos/BartoszBlaszczak/third/contents/{+path}",
    "compare_url": "https://api.github.com/repos/BartoszBlaszczak/third/compare/{base}...{head}",
    "merges_url": "https://api.github.com/repos/BartoszBlaszczak/third/merges",
    "archive_url": "https://api.github.com/repos/BartoszBlaszczak/third/{archive_format}{/ref}",
    "downloads_url": "https://api.github.com/repos/BartoszBlaszczak/third/downloads",
    "issues_url": "https://api.github.com/repos/BartoszBlaszczak/third/issues{/number}",
    "pulls_url": "https://api.github.com/repos/BartoszBlaszczak/third/pulls{/number}",
    "milestones_url": "https://api.github.com/repos/BartoszBlaszczak/third/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/BartoszBlaszczak/third/notifications{?since,all,participating}",
    "labels_url": "https://api.github.com/repos/BartoszBlaszczak/third/labels{/name}",
    "releases_url": "https://api.github.com/repos/BartoszBlaszczak/third/releases{/id}",
    "deployments_url": "https://api.github.com/repos/BartoszBlaszczak/third/deployments",
    "created_at": "2021-07-03T20:51:19Z",
    "updated_at": "2021-07-03T20:51:20Z",
    "pushed_at": "2021-07-03T20:51:43Z",
    "git_url": "git://github.com/BartoszBlaszczak/third.git",
    "ssh_url": "git@github.com:BartoszBlaszczak/third.git",
    "clone_url": "https://github.com/BartoszBlaszczak/third.git",
    "svn_url": "https://github.com/BartoszBlaszczak/third",
    "homepage": "http://third.com/",
    "size": 8772,
    "stargazers_count": 0,
    "watchers_count": 0,
    "language": null,
    "has_issues": false,
    "has_projects": true,
    "has_downloads": true,
    "has_wiki": true,
    "has_pages": false,
    "has_discussions": false,
    "forks_count": 0,
    "mirror_url": null,
    "archived": false,
    "disabled": false,
    "open_issues_count": 0,
    "license": {
      "key": "mit",
      "name": "MIT License",
      "spdx_id": "MIT",
      "url": "https://api.github.com/licenses/mit",
      "node_id": "MDc6TGljZW5zZTEz"
    },
    "allow_forking": true,
    "is_template": false,
    "web_commit_signoff_required": false,
    "topics": [],
    "visibility": "public",
    "forks": 0,
    "open_issues": 0,
    "watchers": 0,
    "default_branch": "master"
  }
]
"""

const val FIRST_REPO_BRANCHES_RESPONSE = """
[
  {
    "name": "feature/dev",
    "commit": {
      "sha": "652069096462dad19acac805e0ac02c3af61a855",
      "url": "https://api.github.com/repos/BartoszBlaszczak/first/commits/652069096462dad19acac805e0ac02c3af61a855"
    },
    "protected": false
  },
  {
    "name": "master",
    "commit": {
      "sha": "073e3b1f039570c733812238fb2c2b90e85ed2ff",
      "url": "https://api.github.com/repos/BartoszBlaszczak/first/commits/073e3b1f039570c733812238fb2c2b90e85ed2ff"
    },
    "protected": false
  }
]
"""

const val SECOND_REPO_BRANCHES_RESPONSE = """
[
  {
    "name": "HTML_DSL",
    "commit": {
      "sha": "b77f6026833b8dcc9975872f03ae42a2f88bfadf",
      "url": "https://api.github.com/repos/BartoszBlaszczak/second/commits/b77f6026833b8dcc9975872f03ae42a2f88bfadf"
    },
    "protected": false
  },
  {
    "name": "dev",
    "commit": {
      "sha": "f115a2189b9f05a5e8b3dfa9a4ee8fd63a184020",
      "url": "https://api.github.com/repos/BartoszBlaszczak/second/commits/f115a2189b9f05a5e8b3dfa9a4ee8fd63a184020"
    },
    "protected": false
  },
  {
    "name": "drop_di",
    "commit": {
      "sha": "53d8825869cad26ecaa8bf39fbf290381ee70a4a",
      "url": "https://api.github.com/repos/BartoszBlaszczak/second/commits/53d8825869cad26ecaa8bf39fbf290381ee70a4a"
    },
    "protected": false
  },
  {
    "name": "master",
    "commit": {
      "sha": "f115a2189b9f05a5e8b3dfa9a4ee8fd63a184020",
      "url": "https://api.github.com/repos/BartoszBlaszczak/second/commits/f115a2189b9f05a5e8b3dfa9a4ee8fd63a184020"
    },
    "protected": false
  }
]
"""

const val USER_NOT_FOUND_RESPONSE = """
{
  "message": "Not Found",
  "documentation_url": "https://docs.github.com/rest/repos/repos#list-repositories-for-a-user"
}
"""
