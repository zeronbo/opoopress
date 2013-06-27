<section>
  <h1><@i18n.msg "Recent Posts"/></h1>
  <ul id="recent_posts">
  
    <#if (site.posts?size < site.recent_posts)>
	  <#assign recent_posts = site.posts >
	<#else>
	  <#assign recent_posts = site.posts[0..site.recent_posts]>
    </#if>
  
    <#list recent_posts as post>
      <li class="post">
        <a href="${ root_url }${ post.url }"><#if (site.titlecase)!false = true>${titlecase(post.title)}<#else>${post.title}</#if></a>
      </li>
    </#list>
  </ul>
</section>